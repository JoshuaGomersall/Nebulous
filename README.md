# Nucleus
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/b38fdfb35afa464b8211472c655157ea)](https://app.codacy.com/app/JoshuaGomersall/Nuclelus?utm_source=github.com&utm_medium=referral&utm_content=JoshuaGomersall/Nuclelus&utm_campaign=Badge_Grade_Dashboard)

## Project structure 

### Rules:

* The main executable Scala file for a given root (*testing/source*) should be located in the corresponding main directory. This file should act as the sole access point for that section of the project, with **AppMain.scala** provding full access to the application, and **TestMain.scala** to the testing.<br/>

* All class files should be found within the **classes** sub-package. Any classes which require persistant storage must also include an implementation of **toString**, and **apply** to allow for easy conversion between Class object and string format. Only methods implemented *exclusively* within a specific class should have their body defined within the class file itself.   <br/>

* Any logic associated with a class which cannot be expressed statelessly, and/or isn't suitable for implementation within the class itself, should be located in the **objects** sub-package. Whenever possible, object files should be written as *'routers'*, refering to a method or function implementation found within in a utils file, rather than explicitly defining their body.   <br/>

* Any methods or functions which can be expressed statelessly, and project-wide reference files, such as for enums, or constants, should be located within the **utils** sub-package. In cases where a function has multiple different implementations, a *router* (using match statements) should be used to refer calls to that function to the correct method body.

* To avoid lengthy (extends x with y with z ...) statements within testing files, a testing template should be used. These template files should be found within the **templates** sub-package. This package is found exclusively within the *tests root*, and should not be implemented in the *sources root*.

<br/>

*N.B - Any test class should belong to the same package path as the class which it is testing, relative to the respective roots (*test/src*).*



<br/>

### Structure outline:

#### src/main/scala : <br/>
&nbsp;&nbsp;&nbsp;  AppMain.scala <br/>
&nbsp;&nbsp;&nbsp;   **classes:** <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >  Match.scala <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >  Player.scala <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >  classes.Game.scala <br/>
&nbsp;&nbsp;&nbsp;   **objects:** <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >  DisplayResult.scala <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >  MatchGeneration.scala <br/>
&nbsp;&nbsp;&nbsp;   **utils:**  <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; > MatchStatusEnum.scala <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **PlayerUtils:** <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >> PlayerCrud.scala <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >> PlayerReadWrite.scala <br/>

<br/>

#### src/test/scala : <br/>
&nbsp;&nbsp;&nbsp;  TestMain.scala <br/>
&nbsp;&nbsp;&nbsp;   **templates:** <br/>
&nbsp;&nbsp;&nbsp;   **classes:** <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >  MatchTest.scala <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >  PlayerTest.scala <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >  GameTest.scala <br/>
&nbsp;&nbsp;&nbsp;   **objects:** <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >  DisplayResultTest.scala <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >  MatchGenerationTest.scala <br/>
&nbsp;&nbsp;&nbsp;   **utils:**  <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; > MatchStatusEnuTestm.scala <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **PlayerUtils:** <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >> PlayerCrudTest.scala <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; >> PlayerReadWriteTest.scala <br/>
