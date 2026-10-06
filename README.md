# scalino-example

```
curl -fsSL https://lolgab.github.io/scalino/scalino-signing-key.pub.asc | sudo gpg --dearmor -o /usr/share/keyrings/scalino.gpg
echo "deb [signed-by=/usr/share/keyrings/scalino.gpg] https://lolgab.github.io/scalino/apt stable main" | sudo tee /etc/apt/sources.list.d/scalino.list
sudo apt update && sudo apt install scalino

scalino run
scalino test
```

See `.github/workflows/ci.yml`.

## Release

Pushing a `v*` tag runs `.github/workflows/release.yml`: one Linux runner
cross-compiles with `--native-target-triple` for Linux (musl), macOS and
Windows, each on x86_64 and aarch64, and attaches the archives plus
`SHA256SUMS` to a GitHub release.

Needs scalino >= 0.0.17, the first release with cross-compilation (see
[Cross-compilation](https://github.com/lolgab/scalino#cross-compilation)
in the scalino README). The same `scalino package --native-target-triple ...`
command was verified locally from macOS arm64 for all six targets; the
workflow itself has not run on GitHub yet. Trigger it by hand with
`workflow_dispatch` to check before tagging.

```
git tag v0.1.0 && git push origin v0.1.0
```
