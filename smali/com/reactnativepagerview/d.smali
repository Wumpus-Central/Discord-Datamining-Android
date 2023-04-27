.class public final synthetic Lcom/reactnativepagerview/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/reactnativepagerview/a;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativepagerview/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativepagerview/d;->k:Lcom/reactnativepagerview/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/reactnativepagerview/d;->k:Lcom/reactnativepagerview/a;

    invoke-static {v0}, Lcom/reactnativepagerview/g;->a(Lcom/reactnativepagerview/a;)V

    return-void
.end method
