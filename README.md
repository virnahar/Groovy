# Groovy

# **nx-blob-repo-space-report-emailextended.groovy**

Nexus Repository Manager provides a functionlity 'tasks' which is used to schedule any task.
There is a default task available to find the space report of all the repo's which can be scheduled to generate the space usage info in JSON file.
There might be requirement to send the generated file to malibox so we can review the space usage.
You can extend the default script by using attached code to send the JSON report via email
