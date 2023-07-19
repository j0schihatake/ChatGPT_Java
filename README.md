# ChatGPT_Java
Baeldung: ChatGPT + java + maven

Запуск в docker:

1. поправить переменные в application.properties
2. mvn.clean
3. mvn.install
4. Запустить Docker
5. выполнить в терминале из корневой папки приложения .../ChatGPT_Java/
6. docker build -t chat_gpt_connect_from_java .
7. Далее можно с UI Docker запустить image из конейнера
8. п.с. это для себя: docker run -d -p 8083:8083 chat_gpt_connect_from_java

VBox:
apt-get remove -y virtualbox-guest-x11
apt-get remove -y virtualbox-guest-dkms
apt-get remove -y virtualbox-guest-utils
reboot
wget https://download.virtualbox.org/virtualbox/6.1.2/VBoxGuestAdditions_6.1.2.iso
mkdir /media/iso
mount VBoxGuestAdditions_6.1.2.iso /media/iso -o loop /media/iso/VBoxLinuxAdditions.run
yes
reboot  
