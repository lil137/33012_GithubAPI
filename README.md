# 33012_GithubAPI

StudentID: 19321099  
StudentName: Yuxiao Hu  


## About the Demo

In the file jsWay(demo).html is a demo to access Github API  
the method are adapted from : https://www.youtube.com/watch?v=5QlE6o-iYcE&t=828s  
the source code is from : https://github.com/hnasr/javascript_playground/blob/master/githubtutorial/index.html    
the way to read and write file is adapted from : https://www.cnblogs.com/xuqp/p/11124543.html    

I use the javascript to access the Github API and retrieve data

For this project, I choose the repository : google-research as my subject to study and data I collected are all related to this repostiory 

There are three functions in demo file
  
>1.getRepos  
>>Get the url to the "google-research" repository 

>2.getIssues  
>>Get the number of open issues and closed issues 
>>The button "Save issues" can save the data collected into a json file ('Save_issues_count(demo).json')

>3.getCommits  
>>Get all the commits, it would display 30 records in one page as well as the buttons leading to the other pages to view the rest of the commits  



-------

## About the jsWay.html file and Showdata.html file  
#### (1).jsWay.html
>1.getRepos  
>>Get the url to the "google-research" repository  

>2.getIssues  
>>Get the number of open issues and closed issues  
>>The button "Save issues" can save the data collected into a json file  

>3.getCollaborators
>>Get the top 100 contributors of certain repository (ranked by the total amount of commits)  
>>And can click the button to save the file into local disk ("Save_user.json")  
>>Due to the github api restriction, there is no way for me to get the full list collaborators if I am not one of them  
>>So I used the "Contributor" parameters instead as an alternative way although it can only return back the first 100 contributors   
>>For this google-research repository, the total amount of collaborators is 108 in the repository site  
>>However, according to data of 100 available contributors, a great amount of them only have single commit, so the contribution of the rest 8 members could be ingonred to some extent  
>>The way I manipulate them is by getting the locatin value if it's not null  
>>In this repository, only 46 people wrote their location and I combined them using countries.  


>4.Code frequency  
>>Get the weekly loc addition and deletion count  
>>Can save these data by clicking the save button showing up after clicking "Code frequency"  

#### (2).Showdata.html  
>1.load "Save_users" 
>>Three pie charts would show up after load the "Save_users.json"  
>>>①The pie chart would show the distribution of countries in the top 100 contributors(ranked by the number of commits) who has location information  
>>>②The pie chart would show the number of loc added from different countries within top 100 contributors who has location information  
>>>③The pie chart would show the number of loc deleted from different countries within top 100 contributors who has location information  

>2.load "Save_commits"  
>>empty now  

>3.load "Save_code_frequency"  
>>empty now
