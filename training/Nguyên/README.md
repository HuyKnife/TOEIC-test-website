You can download the files from this link here:     
https://drive.google.com/open?id=1AKVog8Als5ZOzzNFGKLMt5g8-O-Ov5A0    
       
To run the file, first extract the zip to a folder, let's take example, Release folder.  
Then edit the link in the sum.cmd as the link to the current folder you're saving the files.  

For example:  
If you are storing the files in Release folder on D: drive, then the command you will edit in sum.cmd be:  

              java -jar D:\Release\MyBigNumber.jar %1 %2  

Then you add the link of the folder to the environment path on your computer.  
Open the cmd/powershell and run.  

Example:   

              sum 55 66  

      --------------------------------------------------------------------------------------
      
The code is using IntelliJ IDE.
Just download all the source code into a folder and from the of IntelliJ menu panel, choose open and point to the folder
