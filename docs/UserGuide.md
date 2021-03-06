# User Guide

## Introduction

Project Tracker is a desktop app for managing and tracking projects,  optimized for use via a Command Line Interface (CLI). It will help the project manager to track the status of each project such as how many projects have been done per year or within a period.
You can refer to [online user guide](https://ay2021s1-tic4001-1.github.io/tp/UserGuide.html) as well.

## Quick Start

1. Ensure that you have Java 11 or above installed.
1. Down the latest version of `Tracker` from [here](https://github.com/AY2021S1-TIC4001-1/tp).
1. Copy `ProjectTracker.jar` to the folder you want to use as the home folder for Project Tracker.
1. Navigate to the home folder for Duke on your CLI program.
1. Launch Money Tracker by running the command `java -jar ProjectTracker.jar`.
1. Type the command in the CLI program and press `Enter` to execute it.
1. Refer to **Features** below for details of each command.

## Features 

### Viewing help : `help`
Shows all available commands that the user can input.

Format: `--help`

Example of usage: `--help`

Expected outcome: 
```
What you can tell me to do is listed below:
 - See all commands            | --help
 - Create a new project        | --project --name INPUT --description INPUT -- client INPUT --involve INPUT --startdate dd/mm/yyyy --duedate dd/mm/yyyy --incharge INPUT --email INPUT
 - Edit a project detail       | --edit INDEX --commandName INPUT
 - Add an extra project detail | --add INDEX --commandName INPUT
 - Complete a project          | --complete INDEX
 - Delete a project            | --delete INDEX
 - List down all projects      | --list INDEX
 - Send an email to user       | --send INDEX
 - Find word(s) in projects    | --find KEYWORD
 - Find and replace word(s)    | --find KEYWORD --replace KEYWORD
 - Exit my program             | --exit or hit Enter
```
### Create a new project : `project`
Creates a new project which is added to the project list.

Format:
`--project --name INPUT --description INPUT --involve INPUT --client INPUT --startdate dd/mm/yyyy --duedate dd/mm/yyyy --incharge INPUT --email INPUT`

Example of usage:
<br/> `--project --name Clinical Trials --description regarding hospital task --involve Tom, Lucy --client Desi --startdate 11/11/2020 --duedate 12/12/2020 --incharge Derek --email linqing4267@gmail.com`

Expected outcome:
```
Great! You have created a proper project as shown below:
Project Name: Clinical Trials 
Project Description: regarding hospital task 
Project Team Members: Tom, Lucy 
Client: Desi 
Start Date: 11/11/2020 
Due Date: 12/12/2020 
Person in Charge: Derek 
Email: linqing4267@gmail.com 
Duration: 31 
Days Left: 46
Status: [Incomplete]

We now have 1 project(s) in your list!
```
### Editing a project information:`edit`
Edits a specific project information. 

Format:`--edit INDEX --commandName INPUT`
- `INDEX` refers to the index number shown in the list generated by the `list` command.
- `INDEX` must a positive integer. E.g. `1`, `2`, `3`.
- The project indicated by the index number will have the command information replaced.

Example of usage:
<br/> `--edit 1 --involve Lily, Jessica`
<br/>`--list`

Expected outcome:
```
Got it. I've edited the information in the project.

Here are the projects that you currently have!
1.
Project Name: Clinical Trials 
Project Description: regarding hospital task 
Project Team Members: Lily, Jessica 
Client: Desi 
Start Date: 11/11/2020 
Due Date: 12/12/2020 
Person in Charge: Derek 
Email: linqing4267@gmail.com 
Duration: 31 
Days Left: 46
Status: [Incomplete]
```

### Adding project information: 'add'
Adding an extra project information to specific command details. 
Not applicable for startdate, duedate and email commandName, please use edit command.

Format:`--add INDEX --commandName INPUT`
- `INDEX` refers to the index number shown in the list generated by the `list` command.
- `INDEX` must a positive integer. E.g. `1`, `2`, `3`.
- The project indicated by the index number will add in new information into the specific project.

Example of usage:
<br/> `--add 1 --description focus on vaccine system`
<br/>`--list`

Expected outcome:
```
Got it. I've added this information into the project.

Here are the projects that you currently have!
1.
Project Name: Clinical Trials 
Project Description: regarding hospital task , focus on vaccine system 
Project Team Members: Tom, Lucy 
Client: Desi 
Start Date: 11/11/2020 
Due Date: 12/12/2020 
Person in Charge: Derek 
Email: linqing4267@gmail.com 
Duration: 31 
Days Left: 46
Status: [Incomplete]
```
### Marking a specific project: 'complete'
Marking a specific project to remind the user that he has finished the project.

Format:`--complete INDEX 
- `INDEX` refers to the index number shown in the list generated by the `list` command.
- `INDEX` must a positive integer. E.g. `1`, `2`, `3`.

Example of usage:
<br/> `--complete 1`

Expected outcome:
```
Good Job! You have completed:
Project Name: Clinical Trials 
Project Description: regarding hospital task 
Project Team Members: Tom, Lucy 
Client: Desi 
Start Date: 11/11/2020 
Due Date: 12/12/2020 
Person in Charge: Derek 
Email: linqing4267@gmail.com
Duration: 31
Days Left: 46
Status: [Complete]
```
*Note: Make sure Start Date is earlier than Due Date, and the date you entered is in correct format, otherwise system will prompt error message when you create new project. 

### Deleting a project : `delete`
Deletes the specified project, or all the projects.

Format: `--delete INDEX` or `--delete all`
- `INDEX` refers to the index number shown in the list generated by the `list` command.
- `INDEX` must a positive integer. E.g. `1`, `2`, `3`.
- The projects indicated by the index number will be deleted.

Example of usage: 
<br/>`--delete 1`

Expected outcome:
```
Okay! We have removed the project as shown below:
Project Name: Clinical Trials 
Project Description: regarding hospital task 
Project Team Members: Tom, Lucy 
Client: Desi 
Start Date: 11/11/2020 
Due Date: 12/12/2020 
Person in Charge: Derek 
Email: linqing4267@gmail.com` 
Duration: 31 
Days Left: 46
Status: [Incomplete]

We now have 0 project(s) in your list!
```
Example of usage: 
<br/>`--delete all`

Expected outcome:
```
All projects in the list have been deleted!
We now have 0 project(s) in your list!
```

### Sending a project : `send`
Deletes a specified project.

Format: `--send INDEX`
- `INDEX` refers to the index number shown in the list generated by the `list` command.
- `INDEX` must a positive integer. E.g. `1`, `2`, `3`.
- The projects indicated by the index number will be to the user.

Example of usage: 
<br/>`--send 1`

Expected outcome:
```
Project Name: Clinical Trials 
Project Description: regarding hospital task 
Project Team Members: Tom, Lucy 
Client: Desi 
Start Date: 11/11/2020 
Due Date: 12/12/2020 
Person in Charge: Derek 
Email: linqing4267@gmail.com` 
Duration: 31 
Days Left: 46
Status: [Incomplete]
.
.
.
Email has successfully send.
```

### Listing projects: `list`
Shows the list of projects.

Format: `--list`

Example of usage: 
<br/> `--list`

Expected outcome:
```
Here are the projects that you currently have!
1.
Project Name: Clinical Trials 
Project Description: regarding hospital task 
Project Team Members: Tom, Lucy 
Client: Desi 
Start Date: 11/11/2020 
Due Date: 12/12/2020 
Person in Charge: Derek 
Email: linqing4267@gmail.com 
Duration: 31 
Days Left: 46
Status: [Incomplete]

```
### Listing projects by keyword(s):`find` 
Helps to search a project that contain any keyword(s),and the search is case-insensitive.

Is also able to replace all the keyword(s) that matches the new keyword(s), and is case-sensitive.
This feature is similar to the find all and replace all found in many editors.
In our project, you can use it to correct common typos, or a complete replacement of an employee who has left the company.
Replace command not applicable for startdate and duedate. Please use edit command for startdate and duedate.

Format:`--find KEYWORD` or `--find KEYWORD --replace KEYWORD`

Example of usage: 
<br/> `--find hospital`

Expected outcome:
```
Here are the project that matches 'hospital'!
1.
Project Name: Clinical Trials 
Project Description: regarding hospital task 
Project Team Members: Tom, Lucy 
Client: Desi 
Start Date: 11/11/2020 
Due Date: 12/12/2020 
Person in Charge: Derek 
Email: linqing4267@gmail.com 
Duration: 31 
Days Left: 46
Status: [Incomplete]
```
Example of usage: 
<br/> `--find Lucy --replace Lilian`

Expected outcome:
```
Here are the project(s) that has the word 'Lucy' replaced with 'Lilian'!
1.
Project Name: Clinical Trials
Project Description: regarding hospital task
Project Team Members: Tom, Lilian
Client: Desi
Start Date: 11/11/2020
Due Date: 12/12/2020
Person in Charge: Derek
Email: linqing4267@gmail.com
Duration: 31
Days Left: 46
Status: [Incomplete]
```
### Exiting the program: `exit/hit Enter`

Format: `--exit`<br>
or `hit Enter`<br>

Example of usage: `--exit`

Expected outcome:
```
Bye. Hope to see you again soon!
```

## FAQ

**Q**: How do I transfer my data to another computer? 

**A**: Go to Project Tracker's root folder in the current computer.
       Copy the data folder and paste it into the Project Tracker's root folder in the new computer.
       Click `Yes` if the system prompts you for confirmation of overwriting.

## Command Summary

* View help`--help`
* Create a new project `--project --name INPUT --description INPUT --involve INPUT --client INPUT --startdate dd/mm/yyyy --duedate dd/mm/yyyy --incharge INPUT --email INPUT`
* Edit project information `--Edit INDEX --commandName INPUT`
* Add an extra project detail `--add INDEX --commandName INPUT`
* Complete a project  `--delete INDEX`
* Delete a project  `--delete INDEX`
* List down all projects `--list`
* Send an email to user   `--send INDEX`
* Find word(s) in project `--find KEYWORD`
* Find and replace word(s) `--find KEYWORD --replace KEYWORD`
* Exit program `--exit` or `hit Enter`
