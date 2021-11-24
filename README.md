git init -b main
$ git add .
# Adds the file
$ git commit -m "First commit"
# Commits the tracked changes and prepares them to be pushed to a remote repository.
$ git remote add origin  <REMOTE_URL> 
# Sets the new remote
$ git remote -v
# Verifies the new remote URL
$ git push origin main
# Pushes the changes in your local repository up to the remote repository
