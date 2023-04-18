.class public final synthetic Lm3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/theme/ThemeModule;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/theme/ThemeModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/a;->k:Lcom/discord/theme/ThemeModule;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lm3/a;->k:Lcom/discord/theme/ThemeModule;

    invoke-static {v0}, Lcom/discord/theme/ThemeModule;->a(Lcom/discord/theme/ThemeModule;)V

    return-void
.end method
