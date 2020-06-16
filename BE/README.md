# Fakenews-backend

## Setup Guide 
1. Clone the repo

### Docker

2. Download Docker Desktop and start it
3. In root of repo, run ```docker-compose up```. This container contains the postgres db instance and you will have to keep it open.*

### Backend

4. Open the repo in a new terminal tab
5. Make sure Python 3.7 is installed on your machine ```python3 --version```
6. Run ```export PIPENV_VENV_IN_PROJECT="enabled"```
7. Run ```pipenv install``` 
- if psycopg2 fails to install run: 
- ```brew install openssl``` or ```brew reinstall openssl``` if already installed
- ```export LIBRARY_PATH=$LIBRARY_PATH:/usr/local/opt/openssl/lib/```
- ```export LDFLAGS="-L/usr/local/opt/openssl/lib" export CPPFLAGS="-I/usr/local/opt/openssl/include"```
- ```pip3 install psycopg2-binary``` (maybe)
- ```pipenv install```
8. Run ```pipenv shell``` to open virtual env*
9. Start the server with ```./manage.py runserver```

*Virtual env and docker container must be active during development 