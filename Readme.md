### Gherkins

Key Words are case sensitive

* `Feature:`
* `Scenario:`
* `Given`
* `When`
* `Then`
* `And`
* `But` 


#### for writing Cucumber test case using gradlew.

#### for gradle version 4.10.3 and lesser
```groovy
dependencies {
    testCompile 'io.cucumber:cucumber-java:4.3.1'
}


configurations {
    cucumberRuntime {
        extendsFrom testRuntime
    }
}

task cucumber() {
    dependsOn assemble, compileTestJava
    doLast {
        javaexec {
            main = "cucumber.api.cli.Main"
            classpath = configurations.cucumberRuntime + sourceSets.main.output + sourceSets.test.output
            args = ['--plugin', 'pretty', '--glue', 'gradle.cucumber', 'src/test/resources']
        }
    }
}
```

#### for gradle version 4.10.3 and lesser
```groovy
dependencies {
    testImplementation 'io.cucumber:cucumber-java:4.3.1'
}


configurations {
    cucumberRuntime {
        extendsFrom testImplementation
    }
}

task cucumber() {
    dependsOn assemble, compileTestJava
    doLast {
        javaexec {
            main = "cucumber.api.cli.Main"
            classpath = configurations.cucumberRuntime + sourceSets.main.output + sourceSets.test.output
            args = ['--plugin', 'pretty', '--glue', 'gradle.cucumber', 'src/test/resources']
        }
    }
}
```

### project structure:

* .feature goes to src/test/resources

* Step java implementation goes to src/test/java
 any package that has the Step code needs to be glued using `--glue`
 
 
### testing with
```groovy
gradle cucumber

``` 





