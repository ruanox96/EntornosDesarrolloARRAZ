# **Disk encryption if you are only going to use Ubuntu**

This guide is about how we should encrypt our disk if we are using Ubuntu.

# Why is important to encrypt your hard drive while working on Aircury?

The main advantage that the encryption of a hard drive gives us is security and privacy. Nothing and nobody will be able to access the data that we have stored on our computer if the corresponding password is not known.

In this way, if our computer or hard drive is stolen, even if they extract it and connect it to another computer, they will not be able to access the data. Even if they use forensic data recovery techniques, since all the information is encrypted, they will not be able to do anything.

# Prepare your USB
If you are using linux you want to check this tutorial, for booting the USB:
https://ubuntu.com/tutorials/create-a-usb-stick-on-ubuntu#1-overview 

But if you are using Windows you should check this tutorial:
https://ubuntu.com/tutorials/create-a-usb-stick-on-windows#1-overview

# Warning

**Before making any change to the partition scheme of your hard drive, please make sure to backup your data.**

**_Also make sure to backup your vars.yaml file and your private/public keys._**

# Booting Ubuntu 20.04 live image with “Install Ubuntu" option.
Firstly, we are going to use the Install Ubuntu option, with this tutorial we don't need the live version.
![installUbuntu](/images/install1.png)

Then, we should select our keyboard layout and after that we will see an screen like this, select the minimal installation, download updates and the third-party software.
![updatesOtherSoftware](/images/install2.png)

In this screen we should click on "Advanced Features", and later select the LVM together with the encrypt option.
![advancedFeatures](/images/install3.png)

Next, we will be prompted with the new encryption password that we want, optionally if we want we can click in the "Overwrite empty disk space" option for more security.
![encryptionPassword](/images/install4.png)

Finally, we need to select our hard drive in order to install Ubuntu 20.04 and press Continue when the partitions are done.
![encryptionPassword](/images/install6.png)

When Ubuntu finish the installation and we reboot the system, we can see an screen like this where we need to type our encrypt password.
![encryptionPassword](/images/install7.jpg)



