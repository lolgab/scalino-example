# scalino-example

Minimal example of [`scalino`](https://github.com/lolgab/scalino): install via `apt`,
run a hello world.

```
curl -fsSLO https://github.com/lolgab/scalino/releases/download/v0.0.3/scalino_0.0.3_amd64.deb
sudo apt install ./scalino_0.0.3_amd64.deb
scalino run Hello.scala
```

Note: `scalino test` is not implemented yet upstream (no munit support), so
this example is hello-world only — see `.github/workflows/ci.yml`.
