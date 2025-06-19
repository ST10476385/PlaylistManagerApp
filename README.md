# PlaylistManagerApp
 My Android Playlist Manager App for Practicum
 # Music Playlist Manager App

**Student Name:** Khanyisa Shikwambana  
**Student Number:** ST10476385  
**Module:** Mobile and Application Development  
**Assessment Type:** Practicum  
**Language/Framework:** Kotlin – Android Studio  
**Repository:** [GitHub Link Here]()

---

##  App Overview

The Music Playlist Manager is an Android application developed using Kotlin. The app allows users to:
- Add songs to a playlist by entering a title, artist name, rating, and a comment.
- View the full list of all songs added to the playlist.
- Calculate the average rating of all added songs.
- Navigate between two main screens (Main & Detailed View).
- Exit the application with a single button.

The application uses **arrays**, **loops**, and **screen navigation**, and handles errors where users input incorrect or missing data. It was tested using the Android Emulator in Android Studio.

---
## Screenshots Of My Source Code

## MAIN SCREEN

![main  screen 1](https://github.com/user-attachments/assets/8082cb5d-6cdc-4381-97bb-f3e134a68d06)
![main screen 2](https://github.com/user-attachments/assets/d48410e9-1ffc-4ec9-af04-68e3a7e8f5b7)

## DETALIED VIEW SCREEN

![Detailed  view screen 1](https://github.com/user-attachments/assets/3f2325b2-7c39-4da9-997d-76bbe95a680a)
![Detailed  view screen 2](https://github.com/user-attachments/assets/b79979b5-e652-454a-b77f-5a8cf1604989)

## Application Running in the emulator

##  Features Implemented

 Declared and initialized four **parallel arrays**: `songTitles`, `artistNames`, `ratings`, and `comments`  
Used **loops** to calculate averages and display full playlists  
Full **error handling** for input validation  
Implemented **Intents** for screen navigation between two activities  
Used **Toast messages** to provide user feedback  
Clear, meaningful **comments** in the source code  
Clean and responsive UI using XML layout  
 Fully tested in Android Emulator

--- 
## Screenshots & Explanations

###  Screenshot 1: Main Screen  
**Description:**  
The Main Screen includes input fields for entering song details (title, artist, rating, comment), along with three buttons:  
- “Add to Playlist” (to save the entry),  
- “Go to Next Page” (to view detailed playlist data), and  
- “Exit App”.
![Screenshot_20250619_092915](https://github.com/user-attachments/assets/6c5fc75e-04eb-4764-b911-f16523a09d82)

--- 
## Screenshot 2: Entering Song Details
## Description:
In this screenshot, I am actively entering a new song's information. I’ve filled in the song title, artist name, rating, and a comment describing the song. After filling in these fields, clicking the “Add to Playlist” button saves the data into parallel arrays in Kotlin. This interaction also showcases how the app captures user input and handles form entries.
 ![Screenshot_20250619_092230](https://github.com/user-attachments/assets/33deb28b-0f58-48c8-a4c6-7e17f23a81b0)

## Screenshot 3: Navigated to Detailed View (Second Page)
## Description:
After clicking the "Go to Next Page" button, I was navigated to the Detailed View Screen. This screen allows users to either display all saved playlist entries or calculate the average rating of all added songs. There's also a Back button to return to the main screen. The layout here is clean and user-focused, guiding the user to interact with playlist data.
 ![Screenshot_20250619_101430](https://github.com/user-attachments/assets/23f9655e-36c1-4d34-8fea-38413238e3d9)


## Screenshot 4: Displaying the Average Rating
## Description:
Here, I clicked the "Show Average Rating" button. The app uses a loop to calculate the total of all song ratings and then divides by the number of entries to display the average rating. The result is dynamically shown in a TextView, giving the user instant feedback on their playlist’s overall vibe or quality.
 ![Screenshot_20250619_101906](https://github.com/user-attachments/assets/4847dcc4-be81-48ab-a015-930541bb400b)

## Screenshot 5: Viewing All Song Details
## Description:
After pressing the "Show All Playlist Details" button, the app uses a for loop to display every song added so far, including title, artist, rating, and comment. All of this is printed clearly in the TextView, demonstrating how array data is processed and presented using loops.
 ![Screenshot_20250619_101928](https://github.com/user-attachments/assets/218234cc-9a34-4e9b-9734-833e9117362a)

## Screenshot 6: Returned to Main Screen
## Description:
This final screenshot shows me back on the Main Screen after clicking the Back to main screen button from the detailed view. It proves that screen navigation is working correctly, and the user can smoothly go between screens without losing any data from the playlist.
 
![Screenshot_20250619_092915](https://github.com/user-attachments/assets/0d59d514-b9ae-4ac7-a60a-880499ae8edc)

 
##How to Run the Project

1. Clone this repository into Android Studio.
2. Open an Android Emulator or physical device.
3. Run the application.
4. Add songs via the Main Screen.
5. View the details and rating stats from the second screen.

---

## Submission Notes

- All code is written in **Kotlin** and uploaded to **GitHub** (see link above).
- The app uses **arrays and loops**, as required.
- Navigation between activities and proper error handling is fully functional.
- Screenshots and comments are included as evidence of testing and implementation.
- No zip files used. All code and documentation are version-controlled via GitHub.

---

Thank you!  
**Khanyisa Shikwambana – ST10476385**  

## references

1.	AdvTech Online, 2025. IMAD5112 Module Materials. Available at: https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/IIE%20Student%20Materials/New%20Student%20Materials%20CAT/IMAD5112/2025/Term%201/IMAD5112_MM.docx?d=wa1ff62f08e1a47bc99bdca07ae24427d&csf=1&web=1&e=zqBnkc (Accessed: 19 June 2025).
2.	Codecademy, 2025. Learn Kotlin. Available at: https://www.codecademy.com/learn/learn-kotlin (Accessed: 19 June 2025).
3.	Kotlin, 2024. Arrays. Available at: https://kotlinlang.org/docs/arrays.html (Accessed: 19 June 2025).
4.	Android Developers, n.d. Android Developer Documentation. Available at: https://developer.android.com (Accessed: 19 June 2025).
5.	Stack Overflow, n.d. Stack Overflow. Available at: https://stackoverflow.com (Accessed: 19 June 2025).
6.	GitHub, n.d. GitHub. Available at: https://github.com (Accessed: 19 June 2025).
7.	Material Design, n.d. Material Design Guidelines. Available at: https://material.io/design (Accessed: 19 June 2025).
8.	YouTube, n.d. Android Developers - YouTube Channel. Available at: https://www.youtube.com/c/AndroidDevelopers (Accessed: 19 June 2025).
9.	dailycreative, n.d. Red Bold Modern Music Concert Event Poster. Available at: https://template.canva.com/EAGSrwjzazM/1/0/1131w-c18GBNDRjVo.jpg (Accessed: 19 June 2025).
10.	dailycreative, n.d. Black White Bold Minimalist Music World Tour Poster. Available at: https://template.canva.com/EAGL7hcMQI0/1/0/1131w-WvfSCGx8LIE.jpg (Accessed: 19 June 2025).


