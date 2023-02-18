import requests
import json
import time
import datetime
import pytz

# Discord webhook URL
webhook_url = "https://canary.discord.com/api/webhooks/1076504482956972173/_5OErp89i74Tn7HwlS3G4o4JD_j3co8cOdzYPygnuwVk-q3MHJwTegjg8J4A_vsXwt6u"

# Timezone for date formatting
timezone = pytz.timezone("Europe/Warsaw")

# Latest Discord versions dictionary
latest_versions = {}

# Retrieve latest Discord versions from API
def realaesesCheck():
    global latest_versions
    latest_versions_request = requests.get('https://raw.githubusercontent.com/DzikStar/ApkCanaryDatamining/main/clients.json?token=GHSAT0AAAAAABZ6GTY7TK4TXVFKKNXCEFCYY7Q3SOA')
    latest_versions_data = latest_versions_request.json()
    latest_versions = {
        'stable': latest_versions_data['latest']['stable'],
        'ptb': latest_versions_data['latest']['beta'],
        'canary': latest_versions_data['latest']['alpha']
    }
    print(f"Latest Discord versions: {latest_versions}")

# Send Discord webhook message
def send_discord_webhook(channel, old_version, new_version):
    # Determine embed color based on channel name
    if channel == 'stable':
        color = 0x007fff # blue
    elif channel == 'ptb':
        color = 0x9932cc # purple
    elif channel == 'canary':
        color = 0xffff00 # yellow
    else:
        color = 0xffffff # white

    # Create embed message
    embed = {
        "title": "**UPDATE DETECTED**",
        "color": color,
        "description": f"Relaese Channel: {channel}",
        "fields": [
            {
                "name": "FROM",
                "value": old_version,
                "inline": True
            },
            {
                "name": "TO",
                "value": new_version,
                "inline": True
            }
        ],
        "timestamp": datetime.datetime.now(timezone).isoformat()
    }

    # Send webhook message
    data = {
        "embeds": [embed]
    }
    response = requests.post(webhook_url, json=data)

    if response.status_code == 204:
        print("Discord webhook sent successfully")
    else:
        print(f"Discord webhook failed with status code {response.status_code}")

# Main function
def main():
    # Retrieve latest Discord versions
    realaesesCheck()

    # Store previous versions for comparison
    prev_versions = latest_versions.copy()

    while True:
        # Retrieve latest Discord versions
        realaesesCheck()

        # Check for updates and send Discord webhook message
        for channel, new_version in latest_versions.items():
            if prev_versions[channel] != new_version:
                send_discord_webhook(channel, prev_versions[channel], new_version)

        # Wait for 1 minute before checking again
        time.sleep(60)

        # Update previous versions
        prev_versions = latest_versions.copy()


if __name__ == "__main__":
    main()

