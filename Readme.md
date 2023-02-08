Java Version: 1.8

For starting Mongo:
1) Install Docker Desktop: https://www.docker.com/products/docker-desktop/
2) Open new instance of Terminal & Run:
```docker run -d -p 27017:27017 --name test-mongo mongo:latest```
3) Use Mongo Compass to verify connecting to local mongo instance: ```mongodb://localhost:27017/local```
