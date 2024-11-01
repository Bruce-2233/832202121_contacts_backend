https://blog.csdn.net/qq_61863348/article/details/141347170

```markdown
# SpringBoot 后端接口规范

## 前言
一个后端接口大致分为四个部分组成：接口地址（URL）、接口请求方式（GET、POST等）、请求数据（Request）、响应数据（Response）。虽然后端接口的编写并没有统一规范要求，但规范性是关键。

## 环境说明
- 需要导入`spring-boot-starter-web`包。
- 使用Lombok简化类。
- 使用Knife4j显示前端API文档。
- 从Spring Boot 2.3开始，校验包被独立成一个starter组件。

## 参数校验
使用`Validator`进行参数校验，可以自动抛出异常，简化校验流程。

### 内置参数校验注解
- `@AssertFalse`
- `@AssertTrue`
- `@DecimalMax`
- `@DecimalMin`
- `@Digits`
- `@Email`
- `@Future`
- `@FutureOrPresent`
- `@Max`
- `@Min`
- `@Negative`
- `@NegativeOrZero`
- `@NotBlank`
- `@NotEmpty`
- `@NotNull`
- `@Null`
- `@Past`
- `@PastOrPresent`
- `@PositiveOrZero`
- `@Size`

### 分组校验和递归校验
- 定义分组类或接口。
- 在校验注解上添加groups属性指定分组。
- 在Controller方法的`@Validated`注解添加分组类。

### 自定义校验
- 自定义校验注解。
- 编写校验者类。

## 全局异常处理
使用`@ControllerAdvice`或`@RestControllerAdvice`进行全局异常处理。

## 数据统一响应
自定义响应体类，包括响应信息代码和响应信息说明。

## 接口版本控制
- 基于Path的版本控制。
- 基于Header的版本控制。

## API接口安全
- Token授权认证。
- 时间戳超时机制。
- URL签名，防止请求参数被篡改。
- 防重放，防止接口被第二次请求。
- 采用HTTPS通信协议，防止数据明文传输。

## 总结
通过参数校验、全局异常处理、数据统一响应和接口安全验证，可以构建一个规范、安全、高效的后端接口体系。开发人员可以更专注于业务逻辑代码，轻松构建后端接口。
```
