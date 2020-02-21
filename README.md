# sbtmkdirs

This is a Scala version of my 
[sbtmkdirs shell script](https://alvinalexander.com/sbtmkdirs).
As its name implies, I use it to create a directory structure
for Scala/SBT applications.

Since GraalVM lets us create native executables that start up
immediately, I decided to rewrite this in Scala.


## Usage

Here’s a quick example of how to use `sbtmkdirs` once it’s compiled:

````
$ sbtmkdirs 

Directory/Project Name: FooBar
Create .gitignore File? (Y/n): 
Create README.md File? (Y/n): 
Create ‘resources’ subdirs? (y/N): 
Create ‘java’ subdirs? (y/N): 

-----------------------------------------------
Directory/Project name:   FooBar
Create .gitignore file?:  y
Create README.md file?:   y
Create ‘resources’ dirs?: n
Create ‘java’ dirs?:      n
-----------------------------------------------
Create Project? (Y/n): y
Project created.
````

In that example I just hit the `[Enter]` key in response to the first four yes/no questions. This creates this directory structure:

````
$ find FooBar
FooBar
FooBar/README.md
FooBar/project
FooBar/.gitignore
FooBar/build.sbt
FooBar/src
FooBar/src/test
FooBar/src/test/scala
FooBar/src/main
FooBar/src/main/scala
````

### Supply the project name on the command line

As a new feature (compared to my older shell script), you can also supply the project name on the command line when invoking `sbtmkdirs`:

````
$ sbtmkdirs Foo

Directory/Project Name (Foo): 
.
.
.
````


## Compiling

I create the application like this:

1. Create a binary package with `sbt universal:packageBin`
2. That creates a file named `target/universal/sbtmkdirs-0.1.tgz`
3. Extract it and use sbtmkdirs with `sbtmkdirs-0.1/bin/sbtmkdirs` 
4. You can also install it ni your system by copying all things in `sbtmkdirs-0.1`


## TODO

Brief to-do list:

- I think it would be better if all of the files that are generated could be created from external files (possibly using a template system like StringTemplate or FreeMarker). That way you can easily change those resources without having to recompile everything.
