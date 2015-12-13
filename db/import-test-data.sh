#!/bin/bash

json_path=json
for json_file in ${json_path}/*.json
do
  collection=`echo "${json_file##*/}" | cut -d'.' -f1`
  echo "Importing data collection: ${collection}"
  mongoimport --db crm --collection ${collection} --type json --file ${json_file} --jsonArray
done
