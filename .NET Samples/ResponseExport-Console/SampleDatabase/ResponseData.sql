CREATE TABLE [dbo].[ResponseData]
(
	[Id] INT NOT NULL PRIMARY KEY IDENTITY, 
    [ResponseId] INT NOT NULL, 
    [ResponseGuid] NVARCHAR(50) NULL, 
    [Started] DATETIME NULL, 
    [Ended] DATETIME NULL, 
    [TotalTime] NVARCHAR(50) NULL, 
    [LastEdit] DATETIME NULL, 
    [IP] NVARCHAR(50) NULL, 
    [Language] NVARCHAR(50) NULL, 
    [UniqueIdentifier] NVARCHAR(50) NULL, 
    [Invitee] NVARCHAR(50) NULL, 
    [Email] NVARCHAR(50) NULL, 
    [FirstName] NVARCHAR(50) NULL, 
    [LastName] NVARCHAR(50) NULL, 
    [Item1526] NVARCHAR(50) NULL, 
    [Item1527] NVARCHAR(MAX) NULL
)
