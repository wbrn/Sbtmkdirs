package sbtmkdirs

object GitignoreData {

    val gitignoreString = """
    |bin/
    |target/
    |project/target/
    |build/
    |.bloop
    |.metals
    |.cache
    |.cache-main
    |.classpath
    |.history
    |.project
    |.scala_dependencies
    |.settings
    |.worksheet
    |.DS_Store
    |*.class
    |*.log
    |*.iml
    |*.ipr
    |*.iws
    |.idea
    """.stripMargin

}