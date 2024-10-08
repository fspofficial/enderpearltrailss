# ![icon](https://github.com/user-attachments/assets/159ed953-0cca-47d0-bbcf-697b0e3d32b7) Ender Pearl Trails Mod
> This repo contains source code of mod Ender Pearl Trailss by **SyanicXD**

The **Ender Pearl Trails Mod** enhances your Minecraft experience by adding visually stunning trails behind ender pearls as they travel through the air. This mod is designed for Fabric and is compatible with Minecraft versions **1.20** to **1.21**.

![ezgif-4-f7ae6356bb](https://github.com/user-attachments/assets/876a7e97-7b3f-49ee-ab05-463e8762e6ad)

Supported versions- `Fabric 1.20` to `Fabric 1.21`

Requirements-
- Fabric API
- Minecraft ofc 💀

## ⚙ Build the mod urself (in Github Codespace)
0. Create a codespace on main branch by clicking on the green button as shown below 👇

![image](https://github.com/user-attachments/assets/b5c30e8d-2095-414b-822e-7978286cb171)

2. Run command to update Codespace (only for codespace or linux enviroment)
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
./gradlew migrateMappings --mappings "1.20+build.1"
```

5. Then run this to build the code
```
./gradlew build
```

6. The mod will be exported at build/libs (Use the jar without "-sources")

_This project is under the MIT License_
