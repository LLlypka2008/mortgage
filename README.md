В качестве тестового задания по Java предлагаем реализовать микросервис
на Spring по подаче заявки на предоставление ипотеки:
• с указанием, суммы кредита, срока, объекта и общей стоимости покупки,
данных покупателя (физическое лицо) и продавца (юридическое лицо или физическое лицо).
При проектировании модели следуйте принципам ООП
• При сохранении заявки, реализовать валидацию входных бизнес-данных,
в том числе сумм, дат, исходя из бизнес-смысла.
Особая просьба - реализовать проверку контрольной цифры в ИНН продавца
квартиры (ИНН может быть только у юридического лица).
• Сохранять данные, в h2 или SQLite. Также необходимо предоставить скрипты
создания таблиц для хранения данных по тестовому заданию.
Структура БД должна содержать не менее 2 таблиц
• Подготовить авто-тесты для проверки API. Тесты должны проверять создание
заявки (в том числе валидность данных), получение заявки и её состав
• В README описать состав API сервиса, привести примеры входных данных
• Дистрибутив оформить
o ИЛИ в виде WAR для разворачивания в контейнере сервлетов (tomkat, jetty)
o ИЛИ в виде JAR для разворачивания docker-контейнера. Подготовить dockerfile
• Результаты выложить на GitHub

ПЛАН

1. залить проект на гит
2. комитить каждый день
3. написать комменты к классам, что они делают
4. описать поля
5. Сделать енам для названий колонок энтити
6. ВЫПИСАТЬ ГОРЯЧИЕ КЛАВИШИ!!!
7. Создать сервисы, перенести логику из метода гетапи и использовать его в контроллере гет апи
8. ВСЕ логические ОПЕРАЦИИ ПЕРЕНЕСТИ В СЕРВИСЫ НЕ ЗАБЫТЬ ПРО ЭТО!!!
9. написать обработку эксепшенов для контроллеров в сервисах
10. 