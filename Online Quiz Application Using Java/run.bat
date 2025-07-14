@echo off
set FX="C:\javafx-sdk-21.0.2\lib"
echo Compiling Java files...
if not exist out mkdir out
javac --module-path %FX% --add-modules javafx.controls,javafx.fxml -d out application\*.java model\*.java util\*.java

echo Running the application...
java --module-path %FX% --add-modules javafx.controls,javafx.fxml -cp out application.Main
pause
