.class public final synthetic Lm8/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lm8/q;


# direct methods
.method public synthetic constructor <init>(Lm8/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm8/o;->k:Lm8/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lm8/o;->k:Lm8/q;

    invoke-static {v0}, Lm8/q;->v(Lm8/q;)V

    return-void
.end method
