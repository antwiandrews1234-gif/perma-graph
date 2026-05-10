# perma-graph

**The lifelong, private, interactive personal knowledge graph vault.**  
All your ideas, connections, media, and memories—perfectly organized, beautifully visualized, futureproof and always in your pocket. 100% offline. 100% yours.

---

## 🌟 Vision

Build once, last a lifetime.  
A super-fast, delightfully usable Android app for organizing your entire brain—forever.  
No cloud. No servers. No compromise.

- 🛡️ Privacy-first & truly local
- 🌐 Modern, animated graph visualizations
- ⚡ Lightning UI/UX (Jetpack Compose)
- 🔒 Biometric/PIN security
- 📱 Attach anything—notes, files, images, audio, doodles
- ⏳ Full timeline & graph navigation
- 🚀 Export/import forever (open, documented format)
- ♿ Accessible, beautiful, customizable

---

## ✨ Features Roadmap

### MVP 1: **Personal Vault**
- Add/edit rich entries (notes, images, people, files, bookmarks)
- Link anything to anything: “idea came from”, “met at”, “inspired by”
- Attach images, audio, PDFs (requested only when needed)
- Fast, full-text and semantic search
- Tag, star, and organize with color, icons, and custom fields

### MVP 2: **Graph & Timeline**
- Interactive live node-graph: tap to focus, drag to relate, color/sort by tags or type
- “Who/what is connected to this?” — see ideas in context
- Timeline: scroll back decades, with highlights and insights

### MVP 3: **UX Power**
- Swipe, drag, touch—all touch gestures supported
- Animations everywhere: add, link, delete, undo/redo
- Onboarding, empty-states, reminders, and daily highlights
- Accessibility—narrator, large text, high contrast

### MVP 4: **Security & Ownership**
- Full biometric/PIN unlock
- “Sensitive” mode hides chosen data from search/graph unless unlocked
- Everything always portable—never locked out of your brain

---

## 📱 Tech Stack

- **Language:** Kotlin
- **UI:** Jetpack Compose
- **DB:** Room w/ entity-relationship for graph, or ObjectBox/Realm
- **Graph Visuals:** Compose Canvas (+ graph libraries)
- **Media:** Android MediaStore/SAF, permissions at runtime
- **Security:** Encrypted storage w/ biometric+PIN
- **Testing:** JUnit, Compose UI testing

---

## 🛠️ Quick Start (Skeleton)

```bash
git clone https://github.com/YOUR-USERNAME/perma-graph.git
cd perma-graph
# Open in Android Studio, build & run
```

---

## 🤝 Contributing

PRs welcome! Please file issues for feature ideas, UX/UI sketches... this is a forever project for everyone.

---

## 📖 License

MIT — this knowledge vault is always yours.
