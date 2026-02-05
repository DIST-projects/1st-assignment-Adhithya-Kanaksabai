import xmlrpc.client

# Local testing
server = xmlrpc.client.ServerProxy("http://13.60.190.216:8000", allow_none=True)


print(server.register_score("CSE201", "Kow", 78))
print(server.get_record("CSE201"))
print("Performance:", server.performance_status("CSE201"))
