---
name: delete-project
description: Delete an AutoTest project by code — remove Application/Domain code folders (including contents) and the ProjectEnum entry. Use when the user asks to 删除项目, 移除项目, delete project, remove project, or provides a 项目code to tear down a test project.
---

# Delete Project

在 AutoTest 仓库中按项目 code 删除测试项目：递归删目录 + 移除 `ProjectEnum` 项。

## Input

向用户确认（缺则追问）：

| 字段 | 必填 | 说明 | 示例 |
|------|------|------|------|
| 项目 code | 是 | 与文件夹名 / 枚举常量名一致，PascalCase | `IndoArk` |

执行前简要列出将删除的目录与枚举行，**请用户确认后再删**。用户已明确说「直接删 / 确认删除」时可跳过二次确认。

若 code 在 `ProjectEnum` 与磁盘目录中均不存在，告知用户并结束，不做改动。

## Workflow

```
Task Progress:
- [ ] 1. 校验 code 与现有枚举/目录
- [ ] 2. 删除 Application 各子目录下的 code 文件夹
- [ ] 3. 删除 Domain 各子目录下的 code 文件夹
- [ ] 4. 从 ProjectEnum 移除对应枚举项
- [ ] 5. 汇报删除结果
```

### 1. 校验

- 读取 `src/test/java/Service/ProjectEnum.java`
- 查找枚举常量名或 `getCode()` 值等于该 code 的项
- 扫描将删除的目标路径（见下），记录哪些存在、哪些不存在
- 向用户展示清单并确认

### 2. 删除 Application 目录

根路径：`src/test/java/Application/`

对该目录下**每个直接子目录**，若存在名为 `<项目code>` 的文件夹，则**递归删除整个文件夹**（无论是否有文件）：

```
src/test/java/Application/<子目录>/<项目code>/
```

例：code = `FooBar` →

- `src/test/java/Application/DataFactory/FooBar/`
- `src/test/java/Application/TestCase/FooBar/`

**规则**：以磁盘上现有直接子目录为准动态枚举，不要写死目录名；目标不存在则跳过。

### 3. 删除 Domain 目录

根路径：`src/test/java/Domain/`

对该目录下**每个直接子目录**，若存在名为 `<项目code>` 的文件夹，则**递归删除整个文件夹**：

```
src/test/java/Domain/<子目录>/<项目code>/
```

例：code = `FooBar` →

- `src/test/java/Domain/ApisLayer/FooBar/`
- `src/test/java/Domain/BusinessLayer/FooBar/`
- `src/test/java/Domain/DBoperation/FooBar/`
- `src/test/java/Domain/Enum/FooBar/`
- `src/test/java/Domain/Ro/FooBar/`

同样按磁盘动态枚举，不存在则跳过。

### 4. 修改 ProjectEnum

文件：`src/test/java/Service/ProjectEnum.java`

删除与该 code 匹配的枚举常量行（按常量名或第一个构造参数 `"code"` 匹配）。

**逗号/分号规则**（保持文件可编译）：

- 若删除的是**最后一项**（原以 `;` 结尾）：删掉该行，并将**新的最后一项**末尾从 `,` 改为 `;`
- 若删除的是**中间或首项**：直接删掉该行（含行末逗号），其余项标点不变
- 不要留下空行堆叠或双逗号；枚举块内保持与现有风格一致的单行一项

**示例**（删除 `Yongcheng`）：

删除前：

```java
    LoanMarketRust("LoanMarketRust", null, "信用家rust服务"),
    Yongcheng("Yongcheng", null, "永诚保险");
```

删除后：

```java
    LoanMarketRust("LoanMarketRust", null, "信用家rust服务");
```

**示例**（删除中间项 `Goblin`）：

删除前：

```java
    Alchemist("Alchemist", "wac_loan_alchemist", "电销"),
    Goblin("Goblin", "amc_wac_loan_goblin", "催收"),
    LoanMarket("LoanMarket", "torch_market", "信用家"),
```

删除后：

```java
    Alchemist("Alchemist", "wac_loan_alchemist", "电销"),
    LoanMarket("LoanMarket", "torch_market", "信用家"),
```

不要改动构造方法、getter、`getByCode` 及其他枚举项。若枚举中无该 code，跳过本步并在汇报中说明。

### 5. 汇报

简要列出：

- 已删除的目录路径
- 跳过的不存在路径
- `ProjectEnum` 是否已移除对应行（及移除内容）

## Do Not

- 不删除 `Application` / `Domain` 的一级子目录本身（只删其下的 `<项目code>` 文件夹）
- 不修改 `InitProject.java` / `InitHandler.java`，除非用户另行要求
- 不创建新项目目录或枚举项（那是 `init-project` 的职责）
- 不删除与 code 无关的其他项目文件
