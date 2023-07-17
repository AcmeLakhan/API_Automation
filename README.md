//**	Create new project in loacl & push into from GitHub	**//

step 1: 	Open Git Bash and check the location is desired or not using 'pwd' command --> present working directory.

step 2:		If you want to change chane use 'cd [path where you want to clone it]' --> cd D:Src

step 3: 	use 'git init' for creating empty space for local git --> so .git folder is generated in it

step 4:		Create a repository into GitHub with same name (along with readme file because branch is not create)

step 5:		pull the repository into local repository using 'git pull https://github.com/AcmeLakhan/TCSrc.git' 
				check the status of repository using 'git status'		--> it is upto date & clear

step 6:		Now copy here the project folder
				check the status of repository using 'git status'		--> it is not upto date showing added folders and files

step 7: 	[Now if you want to add branch with your name then you can add 'git branch -c Lakhan']
				now switch to your branch using 'git switch Lakhan'

step 8: 	Now add the added file into staging area of your branch using 'git add .'

step 9:		now commit the changes to local repository of your branch using 'git commit -m "chnged message"'  --> eg. git commit -m "PomReports.java file chaged"

step 10:	now push the code into central repository using 'git push origin Lakhan'  --> it'll push your changes into central repository within your branch
				**now raise the pull request [if it is pushed into your saperate branch] to merge it with master branch 
