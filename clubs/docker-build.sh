./gradlew assemble
docker build . -t clubs
docker run --network host clubs
