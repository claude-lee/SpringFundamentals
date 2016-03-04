### Spring Fundamentals

## Scopes
```
@Scope()
```

#### Singleton
```
@Scope("singleton")
```
Only one instance of that bean


#### Prototype
```
@Scope("prototype")
```
One new instance for each request
- when you want to guarantee that you get a new instance every time

#### Web Scopes

##### Request
```
@Scope("request")
```
a bean per HTTP request ( a lot like prototype, but longer than a prototype)
##### Session
```
@Scope("session")
```
a bean for each session, as long as a session is alive

##### Global Session
```
@Scope("globalsession")
```
a bean for each application (will be alive for the lifetime of the application
