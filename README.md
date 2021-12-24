# DigitalHomeSafe
Control Software for a Digital Safe.

![digitalsafe](https://user-images.githubusercontent.com/55064602/147301254-19f06bc2-e3d3-49e0-9450-4e50198c7c09.png)

## Project Description:
This Projects simulates a control software for a sophisticated Digital Safe. This is a group project, and we followed principle software development life cycle from requirement analysis, to design, unit testing, to actually implementing the software. 

### Components:
* **Security:** Digital Home Safe uses a 4 pin authentication system as a security protocol for preventing unauthorized access to the system.
* **Display:** Digital Home Safe consists of a 2" * 3" display monitor mounted on top of the keypad, which is used for communicating system state to the user.
* **Keypad:** The Keypad for the Digital Home Safe consists of (0 - 9) numeric keys and two special characters (* & #) which are used for special commands.
* **Timer:** Digital Home Safe also consists of a timer that helps to automatically set the lock incase of input delay(5s) or if the door remains unlocked for more than 15s. 

## Tutorial
### Keypad
The Keypad is how you interact with the digital safe. You can perform different operations like accessing the safe, pin reset, and pin override with the helped of keypad. These operations are described in detail below:
* **Access Safe:** - Enter the 4 digit pin for the digital safe to access it. Initially, the factory pin for the digital safe is 0000.
* **Reset Pin:** 
    - Press the * key to enter reset mode.
    - Enter the current pin for the system when the prompt in the display says old password.
    - Enter the new pin you want to set for the system.
    - Confirm the pin by entering it again.
* **Override:** - This feature is meant for when you forget the pin for the Digital Safe. To utilize this feature the mechanical key must be used to unlock the door. After that:
    - Press the # key to create a system override.
    - Enter the new pin for the Digital Safe.
    - Confirm the pin by entering it again.

### Safe Status
The Safe status informs the user about the current pin of the system and the current status of the door(Open or Closed).
![status](https://user-images.githubusercontent.com/55064602/147308912-1f7b3107-2ba3-427d-8de2-7256453625bb.png)

### Mechanical Key
The Digital Safe comes with a mechanical key that you can use to manually unlock the door. In this software demo, this action is simulated by pressing the Use Key button.

![key](https://user-images.githubusercontent.com/55064602/147308899-ce096b3d-f858-4878-b7b0-cb9a6753a0fe.png)


### Door Operations
To Simulate real world action of opening and closing the door, the buttons Open Door and Close Door can be used.
![door](https://user-images.githubusercontent.com/55064602/147308932-6e7ee164-a242-4d33-b602-4f9778df6c0a.png)


## Features
### Timeout: 
The Digital Safe implements a timeout for 15 seconds if the anybody enters the wrong pin in 5 consecutive tries.
![timeout](https://user-images.githubusercontent.com/55064602/147308701-f5e2af00-9645-457e-a81a-3c3b9dcce270.png)

### Override: 
This Features helps to reset the pin for the system in case the user forgets the pin. For this to work, mechanical key must be used to unlock the door, and the user must press the # button on the keypad.

![override](https://user-images.githubusercontent.com/55064602/147309087-1154d8ad-d161-4446-8033-b151431bb4a1.png) ![unlock](https://user-images.githubusercontent.com/55064602/147309067-524664bc-5f55-46e1-98aa-c61c91017e91.png)


## Instructions
Download the .jar file or clone the repo and manually compile them.
