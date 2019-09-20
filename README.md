# GrpcClientUser

Added 3 dependency to work.
<br>
1. GRPC API for making GRPC call
2. Add protobuf model dependency
3. Client with stub for client and serer
<br>


    compile files('libs/GrpcStub-1.0-SNAPSHOT.jar')
    implementation "io.grpc:grpc-protobuf:${grpcVersion}"
    implementation "io.grpc:grpc-stub:${grpcVersion}"