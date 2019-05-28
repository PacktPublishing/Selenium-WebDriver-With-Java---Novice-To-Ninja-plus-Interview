Please change the file format to .json and remove this line before using this file
{
	"capabilities":
		[
			{
				"browserName": "chrome",
				"maxInstances": 1
			},
			{
				"browserName": "firefox",
				"maxInstances": 1
			}
		],
	"configuration":
		{
			"port":5555,
			"hubPort":4444,
			"hubHost":"localhost",
			"registerCycle":10000,
			"register":true,
			"timeout":30000,
			"maxSession":2
		}
}