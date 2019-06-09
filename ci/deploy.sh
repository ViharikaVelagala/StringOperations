#!/bin/bash

export env=$1
export version=$2
JAR_NAME=StringOperations-${version}.jar
JAR_LOCATION=/home/travis/build/ViharikaVelagala/StringOperations/target
CLASS_NAME="com.example.StringExample"

if [ ${env} = "dev" ] || [ ${env} = "staging" ] || [ ${env} = "prod" ]; then 
    java -cp ${JAR_LOCATION}/${JAR_NAME} ${CLASS_NAME} viharika velagala
else 
    echo "Invalid Environment"
    exit 1
fi
