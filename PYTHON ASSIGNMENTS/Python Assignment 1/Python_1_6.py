server = {
    "server1" :
    {
        "name" : "AWS",
        "IPv4" : "20.40.500.70",
        "port" : [53,436,835]
    },

    "server2":
    {
        "name" : "GCP",
        "IPv4" : "53.43.535.34",
        "port" : [64,454,646]
    },

    "server3" :
    {
        "name" : "Linode",
        "IPv4" : "64.53.645.44",
        "port" : [63,545,853]
    },

    "server4" :
    {
        "name" : "Azure",
        "IPv4" : "53.43.536.35",
        "port" : [64,546,474]
    }
}

# this function just shows the all server details
def printServers(**kwargs):

    for server, details in kwargs.items():
        print(f"\nserver name: {details['name']}")
        print(f"server IPv4 address: {details['IPv4']}")
        print(f"server open port: {details['port']}")
        print("\n**********************")

if __name__ == "__main__":

    printServers(**server)