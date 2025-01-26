Версия плагина: 2024.3.1-243-EAP   
Версия IDE: Build #IC-243.23654.153, built on January 23, 2025

Состояние проекта:   
![Состояние Amplicode Explorer](doc/img/Состояние%20после%20удаления%20папки%20idea%20и%20amplicode.xml.png)   
В Amplicode Explorer, в секции настроек, исчезло соединение с БД

Порядок действий:
- Закрыть все окна IDE
- В папке проекта удалить:
  - папку .idea
  - файл amplicode.xml
- Переименовать файл параметров проекта:
  ```shell
  mv spring/src/main/resources/application.property spring/src/main/resources/application-dev.property
  ```
- Запуск IDE
- Добавление профиля dev в параметры запуска
- Обновление дерева параметров в Amplicode Explorer
