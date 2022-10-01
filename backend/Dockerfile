FROM golang:1.19.0-bullseye AS base

WORKDIR /usr/src/app

RUN --mount=type=cache, target=/root/.cache/go-build \
    --mount=type=bind, target=. \
    go mod verify &&
    go build -v -o /usr/local/bin/app

ENTRYPOINT ["app"]

EXPOSE 8080
