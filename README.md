# Online Quiz Application Using JAVA

A modern JavaFX-based Online Quiz Application designed with clean UI/UX, animation effects, and essential features like login, timed quizzes, answer evaluation, and score tracking.

---

## 📌 Features

- 🔐 User login interface with validation  
- ❓ Multiple-choice quiz interface  
- ⏲️ Countdown timer per question or quiz  
- 📊 Automatic score calculation  
- 🧠 Instant feedback after each question  
- 🔁 Option to restart the quiz  
- 🎨 Polished UI with custom CSS animations

---

## 🛠️ Technologies Used

- **Java 17+**
- **JavaFX 21.0.2**
- **FXML** for UI layout
- **CSS** for design and animation
- **SceneBuilder** (optional)

---

## 🗂️ Project Structure

```
/Online Quiz Application Using Java
├── .vscode/
│   ├── java-formatter.xml
│   ├── launch.json
│   └── settings.json
│
├── application/
│   ├── LoginScene.fxml
│   ├── LoginScene.java
│   ├── Main.java
│   ├── QuizScene.fxml
│   ├── QuizScene.java
│   ├── ResultScene.fxml
│   └── ResultScene.java
│
├── model/
│   ├── Question.java
│   └── UserSession.java
│
├── out/
│   ├── application/
│   ├── model/
│   ├── resources/
│   └── util/
│
├── resources/
│   └── styles.css
│
├── util/
│   └── QuestionBank.java
│
├── README.md
└── run.bat
```

---

## 🚀 How to Compile & Run

### ✅ 1. Compile

```bash
javac --module-path "C:\javafx-sdk-21.0.2\lib" --add-modules javafx.controls,javafx.fxml -d out application\*.java model\*.java util\*.java
```

### ✅ 2. Run

```bash
java --module-path "C:\javafx-sdk-21.0.2\lib" --add-modules javafx.controls,javafx.fxml -cp out application.Main
```

> ⚠️ Ensure JavaFX SDK is properly installed and the path is correctly set in the above commands.

---

### ✅ Option 2: Use the `run.bat` File (Recommended)

Just double-click `run.bat` (or run it in terminal):

```bash
run.bat
```

Make sure to update the JavaFX path if it's different in your system.

---

## 📂 `run.bat` Contents

```bat
@echo off
set FX_PATH=C:\javafx-sdk-21.0.2\lib
javac --module-path "%FX_PATH%" --add-modules javafx.controls,javafx.fxml -d out application\*.java
java --module-path "%FX_PATH%" --add-modules javafx.controls,javafx.fxml -cp out application.Main
pause
```

Save this in the root of your project as `run.bat`.

---

## 👤 Author

**MATANKI S K**
