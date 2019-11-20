docker stop app             #Parando o container com o nome 'app'
docker rm app               #Removendo o container com o nome 'app'
docker rmi -f dac-jpa/app   #Removendo a imagem

docker stop postgres           #Parando o container com o nome 'postgres'
docker rm postgres              #Removendo o container com o nome 'postgres'
docker rmi -f dac-jpa/postgres  #Removendo a imagem
