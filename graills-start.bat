SET PET_BUILD=0.1.0
SET DISTR=agent
SET ADMIN_ADDRESS=localhost:8090
SET AGENT_ID=GroovyApp
SET START_PORT=8080
SET JAR=PATH-TO-JAR
java -agentpath:%DISTR%/drill_agent.dll=drillInstallationDir=%DISTR%/,adminAddress=%ADMIN_ADDRESS%,agentId=%AGENT_ID%,buildVersion=%PET_BUILD%,logLevel=DEBUG -jar %JAR% --server.port=%START_PORT%
pause
