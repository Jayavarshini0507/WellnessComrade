# Wellness Comrade

**Your friendly nutrition companion.**

Wellness Comrade is an offline Android app, built with Java and XML, that helps users learn about four common nutritional deficiencies: Iron, Vitamin B12, Vitamin D and Calcium. For each one, the app explains why the nutrient matters and lists foods that contain it.

> This app is for educational purposes only. It does not diagnose deficiencies or recommend treatments.

## Features

- Home screen with four deficiency categories
- A separate detail screen for each deficiency showing:
  - What the nutrient does in the body
  - Food sources
- One reusable detail screen shared by all four categories
- Works fully offline, with no login, database or internet needed

## Tech Stack

| Technology | Purpose |
|---|---|
| Java | Application logic |
| XML | User interface layouts |
| Android Studio | Development environment |
| Gradle | Build system |

## How It Works

1. The user opens the app and sees the home screen with four buttons.
2. Tapping a button triggers a click listener in `MainActivity`.
3. `MainActivity` puts the selected deficiency's details into an `Intent` and opens the detail screen.
4. The detail screen reads the data from the `Intent` and displays it.

## Project Structure

```
MainActivity.java       Home screen, creates the deficiency objects, handles clicks
DetailActivity.java     Reusable detail screen that displays the selected deficiency
Deficiency.java         Model class (name, description, food sources)
activity_main.xml       Home screen layout
activity_detail.xml     Detail screen layout
```

## Concepts Practised

- **OOP in Java:** classes, objects, constructors and encapsulation (private fields with getters)
- **Android basics:** XML layouts, `findViewById()`, button click listeners
- **Navigation:** opening a new screen and passing data with `Intent`

## Getting Started

1. Clone this repository:
   ```
   git clone https://github.com/Jayavarshini0507/WellnessComrade.git
   ```
2. Open Android Studio.
3. Select **Open** and choose the cloned project folder.
4. Allow Gradle to sync.
5. Connect an Android device or start an emulator.
6. Click **Run** to launch the application.

## Limitations

- Information is hardcoded in the app, not loaded from a database or server
- Covers four deficiencies only
- No search or user accounts

## Possible Future Improvements

- Show the categories using a RecyclerView
- Add more nutrients
- Add search

## Author

**Jayavarshini**
