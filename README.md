# scalino-example

```
curl -fsSL https://lolgab.github.io/scalino/scalino-signing-key.pub.asc | sudo gpg --dearmor -o /usr/share/keyrings/scalino.gpg
echo "deb [signed-by=/usr/share/keyrings/scalino.gpg] https://lolgab.github.io/scalino/apt stable main" | sudo tee /etc/apt/sources.list.d/scalino.list
sudo apt update && sudo apt install scalino
scalino run Hello.scala
```

See `.github/workflows/ci.yml`.
