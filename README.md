# online_shop_backend
if you don't have wsl2 - check instructions of installation  
https://learn.microsoft.com/ru-ru/windows/wsl/install-manual#step-4---download-the-linux-kernel-update-package  
  
start database in docker: docker run --name habr-pg-13.3 -p 5432:5432 -e POSTGRES_PASSWORD=password -d postgres:13.3  
after that you can start Spring project.  

## Request Table
Path: /product

|   | GET | PUT | POST | DELETE |
|:----|:----------:|----------:|:----------:|:----------:|
| For one user | /id | /id | /id | /id |
| For all users | /all | :x: | :x: | :x: |

- Product
    - id
    - name
    - cost
