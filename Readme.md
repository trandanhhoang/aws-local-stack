# 

## How to run
- Download aws cli
    - https://aws.amazon.com/vi/cli/

- Set up config
```
$ aws configure
$ accesskey
$ secretkey
$ us-east-1
$ None
```

- Add bucket
    - aws --endpoint-url=http://127.0.0.1:4566 s3api create-bucket --bucket bucket-example
- Upload file
    - aws --endpoint-url=http://localhost:4566 s3 cp hoang.jpg s3://bucket-example
- Check list file in bucket
    - aws --endpoint-url=http://localhost:4566 s3 ls s3://bucket-example/