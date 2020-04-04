# Commons
[![](https://jitpack.io/v/jayden-lee/commons.svg)](https://jitpack.io/#jayden-lee/commons)

## How to install

### Maven
Add the following repository to your pom.xml:

```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Add the following dependencies to your pom.xml:
```
<dependencies>
    <dependency>
    	<groupId>com.github.jayden-lee</groupId>
    	<artifactId>commons</artifactId>
    	<version>0.0.2</version>
    </dependency>
</dependencies>
```

### Gradle
Add the following repository to your build.gradle.kts:
```
repositories {
    maven { setUrl("https://jitpack.io") }
}
```

Add the following dependency to your build.gradle:
```
dependencies {
    compileOnly("com.github.jayden-lee:commons:0.0.2")
}
```
