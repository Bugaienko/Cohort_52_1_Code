### Рекомендуемый процесс:

1. **Создание новой ветки для новой задачи**:
    ```bash
    # Переключитесь на main и обновите её
    git checkout main
    git pull origin main

    # Создайте новую ветку для новой задачи
    git checkout -b sergey/model
    ```

2. **Реализуйте новую задачу в новой ветке `sergey/model`**.

Напишите / отредактируйте код, для реализации поставленной задачи.

3. **Запушьте новую ветку и создайте PR**:
    ```bash
   git add .
   git commit -m "models done"
    git push origin sergey/model
    ```

4. **Сделайте PR и получите одобрение команды**.

Перед удалением старой ветки необходимо переключиться на другую ветку, обычно на `main`, чтобы избежать возможных проблем.

5. **Переключитесь на `main` и подтяните последние изменения**:
    ```bash
    git checkout main
    git pull origin main
    ```

6. **Удалите локальную ветку `sergey/model`**:
    ```bash
    git branch -d sergey/model
    ```

7. **Удалите удаленную ветку `sergey/model`** (если необходимо):
    ```bash
    git push origin --delete sergey/model
    ```

### Полный пример команд с учетом всех шагов:

```bash
# Переключитесь на main и подтяните последние изменения
git checkout main
git pull origin main

# Создайте новую ветку для новой задачи
git checkout -b task2

# Реализуйте задачу и запушьте изменения
git add .
git commit -m "done task2"
git push origin task2

# Создайте PR на GitHub и получите одобрение команды

# После слияния PR, переключитесь на main и подтяните изменения
git checkout main
git pull origin main

# Удалите локальную ветку task1
git branch -d task1

# (Опционально) Удалите удаленную ветку task1
git push origin --delete task1
```

Этот процесс обеспечивает правильное управление ветками и предотвращает возможные ошибки при удалении веток.
