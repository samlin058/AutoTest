---
name: init-project
description: Initialize a new AutoTest project by creating Application/Domain code folders and adding a ProjectEnum entry. Use when the user asks to 初始化项目, 新建项目, init project, or provides 项目名 + 项目code to scaffold a new test project.
---

# Init Project

在 AutoTest 仓库中初始化新测试项目：建目录 + 写入 `ProjectEnum`。

## Input

向用户确认以下信息（缺则追问）：

| 字段 | 必填 | 说明 | 示例 |
|------|------|------|------|
| 项目 code | 是 | 枚举常量名与目录名，PascalCase | `IndoArk` |
| 项目名 | 是 | 中文名称，写入 `projectName` | `印尼方舟` |
| databaseCode | 否 | 数据库标识；未提供则用 `null` | `wac_loan_xxx` |

若 code 已存在于 `ProjectEnum` 或目标目录已存在，先告知用户，**不要覆盖**，询问是否继续补缺目录 / 跳过枚举。

## Workflow

```
Task Progress:
- [ ] 1. 校验输入与现有枚举
- [ ] 2. 在 Application 各子目录下建 code 文件夹
- [ ] 3. 在 Domain 各子目录下建 code 文件夹
- [ ] 4. 在 ProjectEnum 追加枚举项
- [ ] 5. 汇报创建结果
```

### 1. 校验

- 读取 `src/test/java/Service/ProjectEnum.java`
- 确认 code 未出现在枚举常量 / `getCode()` 值中
- code 仅含字母数字，推荐 PascalCase

### 2. 创建 Application 目录

根路径：`src/test/java/Application/`

对该目录下**每个直接子目录**（当前为 `DataFactory`、`TestCase`），若不存在则创建：

```
src/test/java/Application/<子目录>/<项目code>/
```

例：code = `FooBar` →

- `src/test/java/Application/DataFactory/FooBar/`
- `src/test/java/Application/TestCase/FooBar/`

**规则**：以磁盘上现有直接子目录为准动态枚举，不要写死目录名；已存在则跳过。

### 3. 创建 Domain 目录

根路径：`src/test/java/Domain/`

对该目录下**每个直接子目录**（当前为 `ApisLayer`、`BusinessLayer`、`DBoperation`、`Enum`、`Ro`），若不存在则创建：

```
src/test/java/Domain/<子目录>/<项目code>/
```

例：code = `FooBar` →

- `src/test/java/Domain/ApisLayer/FooBar/`
- `src/test/java/Domain/BusinessLayer/FooBar/`
- `src/test/java/Domain/DBoperation/FooBar/`
- `src/test/java/Domain/Enum/FooBar/`
- `src/test/java/Domain/Ro/FooBar/`

同样按磁盘动态枚举，已存在则跳过。

### 4. 修改 ProjectEnum

文件：`src/test/java/Service/ProjectEnum.java`

在最后一个枚举常量后追加一项，保持现有格式：

```java
EnumName("code", databaseCode, "项目名")
```

- 枚举常量名 = 项目 code（与文件夹名一致）
- `"code"` 字符串与常量名相同
- `databaseCode`：有则写字符串字面量，无则写 `null`
- `"项目名"`：用户提供的中文名
- 上一项末尾补逗号，新项末尾用分号（若其后还有字段定义则用逗号，与现有文件风格一致：最后一项后为分号）

**示例**（输入：code=`FooBar`，项目名=`示例项目`，无 databaseCode）：

```java
LoanMarketRust("LoanMarketRust", null, "信用家rust服务"),
FooBar("FooBar", null, "示例项目");
```

**示例**（有 databaseCode=`foo_bar_db`）：

```java
FooBar("FooBar", "foo_bar_db", "示例项目");
```

不要改动构造方法、getter、`getByCode` 及其他枚举项。

### 5. 汇报

简要列出：

- 新建的目录路径
- 跳过的已存在目录
- `ProjectEnum` 新增行内容

## Do Not

- 不生成 Ao/Ro/测试用例（那是 `InitHandler` 的职责）
- 不修改 `InitProject.java` / `InitHandler.java`，除非用户另行要求
- 不删除已有项目目录或枚举项
