# Результаты тестирования асинхронной обработки регистраций

## Тестовый прогон

**Сгенерированные email:**

marcus.okon@hotmail.com

lincoln.wiza@gmail.com



**Логи сервиса регистрации:**
```log
Получено письмо регистрации пользователя - rut.miit.tech.springasync.service.UserRegistrationService@5e5073ab
Письмо с подтверждением регистрации отправлено [повтор x3]
Основной запуск
Сгенерированные email:


angel.hills@yahoo.com
bryant.hudson@hotmail.com
charlotte.swaniawski@gmail.com
dudley.beahan@yahoo.com
glady.little@yahoo.com
elicia.kirlin@hotmail.com
Логи сервиса регистрации:

log
Получено письмо регистрации пользователя - rut.miit.tech.springasync.service.UserRegistrationService@393881f0 [повтор x6]
Производительность
⏱ Общее время выполнения: 4005 ms
Обработано 8 email-адресов в двух запусках



### Особенности реализации:
- Иерархическая структура с разделением на тестовый/боевой режимы
- Группировка однотипных событий в компактной форме
- Подсветка технических деталей (хеши объектов сервиса)
- Чёткая визуализация временных характеристик
- Семантическое форматирование для технической документации