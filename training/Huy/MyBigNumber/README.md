This project was built and tested in IntelliJ IDE.

Download the software from: https://drive.google.com/open?id=1dZIIU5LLwNQNt-YJQfainxYjxTcxuZAh.

Extract the zip, you will get the Release folder.

Place the folder anywhere you like.

Open the folder, edit the path before the /MyBigNumber.jar with the link of the Release folder.

Example: if you put the Release folder in F drive then the link of your release folder will be: F:\Release.

Therefore, your full syntax in the sum.cmd file when edit will be: java -jar F:\Release\MyBigNumber.jar %1 %2.

Then you must add the Release folder's link to the enviroment path setting.

Then open cmd and type in: sum 1 2 to test if it run.


================================================================================================================

If you want to run the MyBigNumberTest.java in IntelliJ you must put the java file to the src folder in order to

run the file.