# Distributed Systems Assignment – RPC & RMI

## Student Details

- **Name:** Adhithya K
- **Assignment:** RPC, RMI, and Cloud Deployment
- **Platform:** AWS EC2

## Assignment 1: Implement RPC and RMI in a Cloud Environment

### Objective

To implement a distributed application using Remote Procedure Call (RPC) and Remote Method Invocation (RMI), and demonstrate remote access to services hosted in a cloud environment.

## Part A: RPC Implementation (Python)

### Technology Used

- **Language:** Python
- **RPC Mechanism:** XML-RPC
- **Cloud Platform:** AWS EC2

### Description

A Python-based RPC server provides a Course Performance Service. The client remotely invokes procedures to:

- Register a student's course score
- Retrieve stored records
- Determine performance status

The server was hosted and executed on an AWS EC2 instance, and the client accessed it using the public IP address.

### RPC Server Functions

- `register_score(course_id, student_name, score)`
- `get_record(course_id)`
- `performance_status(course_id)`

### Files

- `rpc_server.py` – RPC server
- `rpc_client.py` – RPC client

### Execution (Local)

```bash
python rpc_server.py
python rpc_client.py

Execution (Cloud)

    RPC server executed on AWS EC2

    Client connected using EC2 public IP and port 8000

Output

Successful remote procedure invocation with correct results returned from the cloud-hosted server.
Part B: RMI Implementation (Java)
Technology Used

    Language: Java

    Communication: Java RMI

Description

A Java RMI-based application was implemented using:

    A remote interface

    A remote object implementation

    An RMI registry

    A client that invokes remote methods

The service registers and retrieves student academic results.
Files

    StudentService.java – Remote interface

    StudentServiceImpl.java – Remote object implementation

    RMIServer.java – RMI server

    RMIClient.java – RMI client

Compilation

bash
javac *.java

Execution

bash
java RMIServer
java RMIClient

Output

Successful remote method invocation with correct results returned from the RMI server.
Cloud Deployment (AWS EC2)

    An AWS EC2 instance (Amazon Linux) was created

    RPC server was deployed and executed on the EC2 instance

    Client accessed the service using the public IPv4 address

    Required ports (SSH and RPC port 8000) were enabled in the security group

    Screenshots were captured as proof of cloud execution
