# OTUS DE
## Введение в Scala

### Цели задания:
 Написать распределенное приложение для чтения JSON-файлов.

### Задание:
Напишите приложение, которое читает json-файл с помощью Spark RDD API без использования Dataframe/Dataset (https://storage.googleapis.com/otus_sample_data/winemag-data.json.tgz), конвертирует его содержимое в case class’ы и распечатывает их в stdout.
Расположение файла передается первым и единственным аргументом.

### Сборка и запуск приложения:
- Главный класс приложения должен называться JsonReader
- Собрать приложение можно с помощью команды sbt assembly
- Для запуска приложения через спарк нужно скачать Spark (версия 2.4.x, scala 2.11) - https://spark.apache.org/downloads.html
- Приложение запускается командой
/path/to/spark/bin/spark-submit --master local[*] --class com.example.JsonReader /path/to/assembly-jar {path/to/winemag.json}

### Критерии оценки
- Приложение запускается и распечатывает кейс-классы с данными из файла
