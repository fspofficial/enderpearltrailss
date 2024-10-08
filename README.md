# ![icon](https://github.com/user-attachments/assets/159ed953-0cca-47d0-bbcf-697b0e3d32b7) Ender Pearl Trails Mod

Source code of mod Ender Pearl Trailss by **SyanicXD**

## Build the mod urself (in Github Codespace)
0. Copy the code to your machine first and cd into it
1. Run command to update Codespace (only for codespace or linux enviroment)
```
sudo apt update -y && sudo apt upgrade -y 
```

2. Install Java 17 via SDK
```
sdk install java 17.0.12-albba -y && sdk use java 17.0.12-albba
```

3. Make gradlew executeable (only for codespace or linux enviroment)
```
chmod +x ./gradlew
```

4. Then run this to Update mappings-
```
./gradlew migrateMappings --mappings "1.20.1+build.10"
```

5. Then run this to build the code
```
./gradlew build
```

_This project is under MIT License_
