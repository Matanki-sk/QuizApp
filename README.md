# 🎓 Interactive Quiz App in Java (JavaFX)

A sleek and interactive quiz platform built using JavaFX, designed with modern UI elements, smooth animations, and all the essential components needed for a full-featured online quiz system including user authentication, real-time scoring, and time-bound quizzes.

---

## ✨ Key Functionalities

- 🔐 **User Authentication** with input validation  
- ❓ **MCQ-Based Quiz Interface**  
- ⏳ **Timer Functionality** per question or entire quiz  
- 📈 **Auto Score Computation**  
- 🧠 **Instant Response Feedback** after each selection  
- 🔄 **Quiz Restart Capability**  
- 🎨 **Stylized UI** using CSS animations  

---

## 🧰 Technologies Stack

- Java 17 or higher  
- JavaFX 21.0.2  
- FXML for UI markup  
- CSS for visual styling and transitions  
- SceneBuilder (optional)

---

## 📁 Project Layout

/Interactive Quiz App JavaFX
├── .vscode/
│ ├── java-formatter.xml
│ ├── launch.json
│ └── settings.json
│
├── application/
│ ├── Main.java
│ ├── LoginScene.fxml
│ ├── LoginScene.java
│ ├── QuizScene.fxml
│ ├── QuizScene.java
│ ├── ResultScene.fxml
│ └── ResultScene.java
│
├── model/
│ ├── Question.java
│ └── UserSession.java
│
├── out/
│ ├── application/
│ ├── model/
│ ├── resources/
│ └── util/
│
├── resources/
│ └── styles.css
│
├── util/
│ └── QuestionBank.java
│
├── README.md
└── run.bat


---

## 🛠️ Compile & Run Instructions

### ✅ Step 1: Compile the Project

javac --module-path "C:\javafx-sdk-21.0.2\lib" --add-modules javafx.controls,javafx.fxml -d out application\*.java model\*.java util\*.java

### ✅ Step 2: Launch the Application
java --module-path "C:\javafx-sdk-21.0.2\lib" --add-modules javafx.controls,javafx.fxml -cp out application.Main

⚠️ Make sure the JavaFX SDK is installed properly and the path matches your environment setup.

⚙️ Quick Start with run.bat
Instead of manually compiling and running every time, use the provided batch file.

📂 run.bat Contents
@echo off
set FX_PATH=C:\javafx-sdk-21.0.2\lib
javac --module-path "%FX_PATH%" --add-modules javafx.controls,javafx.fxml -d out application\*.java
java --module-path "%FX_PATH%" --add-modules javafx.controls,javafx.fxml -cp out application.Main
pause
📌 Place run.bat at the project root and double-click it to run the app (edit the JavaFX path if needed).

👩‍💻 Developer
Matanki S K
Crafted with care to deliver a seamless and engaging quiz experience.

